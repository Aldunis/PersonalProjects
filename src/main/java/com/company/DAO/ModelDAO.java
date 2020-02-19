package com.company.DAO;

import com.company.Model.Book;
import com.company.Util.DBConnectionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModelDAO {
    private  static Logger logger = LogManager.getLogger(ModelDAO.class);
    private static final String SEP1 = "'";
    private static final String SEP2 = "', ";
    private static final String SEP3 = ", ";

    private DBConnectionService conService;
    public ModelDAO() {
        conService = DBConnectionService.getInstance();
    }
    //DELETE METHOD
    public void deleteBook(String tabelName, Book book) throws Exception {
        this.deleteBook("Book" , book);
    }
    //INSERT METHOD
    public void insertBook(Book book) throws Exception {
        this.insert("Book", book);
    }

    public void insertAtlas(Book book) throws Exception {
        this.insert("Atlas", book);
    }

    public void insertRevista(Book book) throws Exception {
        this.insert("Revista", book);
    }
    //DELETE METHOD

    public void delete(String tabelName , Book book) {
        String querry = "Delete from BOOK.BOOK" + tabelName + "VALUES(%s);";
    }

    //INSERT METHOD

    public void insert(String tabelName, Book book) throws Exception {

        String query = "insert into BOOK."+ tabelName +" VALUES (%s);";
        StringBuilder queryParams = new StringBuilder();
        queryParams.append(SEP1);
        queryParams.append(book.getName());
        queryParams.append(SEP2);

        queryParams.append(book.getYear());
        queryParams.append(SEP3);

        queryParams.append(SEP1);
        queryParams.append(book.getAuthor());
        queryParams.append(SEP2);

        queryParams.append(SEP1);
        queryParams.append(book.getType());
        queryParams.append(SEP2);

        queryParams.append(book.getPrice());


        switch (tabelName) {
            case("Revista"):
                {
                break;
            }
            case("Book"): {
                break;
            }
            case("Atlas"): {
                break;
            }
            default: {
                throw new Exception("Unknown table");
            }
        }
        query = String.format(query ,  queryParams.insert(0 , "12, ").toString());
        conService.getStatement().executeUpdate(query);
    }
}
