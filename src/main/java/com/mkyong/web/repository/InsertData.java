package com.mkyong.web.repository;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* Servlet implementation class InsertData
*/
@WebServlet("/insertData")
public class InsertData extends HttpServlet {
private static final long serialVersionUID = 1L;

    private String tutID;
    private String tutName;
    private String tutorName;
    private String tutDes;
    private String tutURL;



/**
* @see HttpServlet#HttpServlet()
*/
public InsertData(){
super();
// TODO Auto-generated constructor stub
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws IOException {
    tutID = request.getParameter("tutID");
    tutName = request.getParameter("tutName");
    tutorName = request.getParameter("tutorName");
    tutDes = request.getParameter("tutDes");
    tutDes = request.getParameter("tutDes");
    tutURL = request.getParameter("tutURL");



    insertDataToDatabase();

    PrintWriter writer = response.getWriter();
    writer.println("Added Tutorial Details"+
            "\nTutorial ID : " + tutID +
            "\nTutorial Name : "+tutName+
            "\nTutor Name : "+tutorName+
            "\nTutorial Description :" + tutDes +
            "\nTutorial Url : "+ tutURL );
    writer.close();
    }

    public void insertDataToDatabase(){
        try {
            // Creating a Mongo client
            MongoClient mongo = new MongoClient("localhost", 27017);

            // Creating Credentials



            //Accessing the database
            MongoDatabase database = mongo.getDatabase("Tutorials");

            System.out.println("Collection created successfully");

            MongoCollection<Document> collection = database.getCollection("tutorial");

            System.err.println("Collection sampleCollection selected successfully");

            Document document = new Document()
                    .append("id", tutID)
                    .append("name", tutName)
                    .append("tutName", tutorName)
                    .append("description", tutDes)
                    .append("url", tutURL);
            collection.insertOne(document);
            System.out.println("Document inserted successfully");
        }catch(Exception ex){
            System.out.println(ex);

        }
    }

}