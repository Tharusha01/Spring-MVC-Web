package com.mkyong.web.repository;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    /**
     * Servlet implementation class InsertData
     */
    @WebServlet("/deleteData")
    public class DeleteData extends HttpServlet {
        private static final long serialVersionUID = 1L;

        private String tutID;

        /**
         * @see HttpServlet#HttpServlet()
         */
        public DeleteData() {
            super();
// TODO Auto-generated constructor stub
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        public void doPost(HttpServletRequest request, HttpServletResponse response)
                throws IOException {
            tutID = request.getParameter("tutId");


            deleteDataToDatabase();

            PrintWriter writer = response.getWriter();
            writer.println("Deleted Tutorial" +
                    "\nTutorial ID : " + tutID);
            writer.close();
        }


        private void deleteDataToDatabase() {
            try {
                // Creating a Mongo client
                MongoClient mongo = new MongoClient("localhost", 27017);


                //Accessing the database
                MongoDatabase database = mongo.getDatabase("Tutorials");

                System.out.println("Collection created successfully");

                MongoCollection<Document> collection = database.getCollection("tutorial");

                System.err.println("Collection sampleCollection selected successfully");

                Document document = new Document()
                        .append("id", tutID);
                collection.deleteOne(document);
                System.out.println("Document deleted successfully");
            } catch (Exception ex) {
                System.out.println(ex);

            }
        }
    }




