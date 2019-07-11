package com.mkyong.web.connection;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Mongodb_connection {

    public void connect(){

        /*try {
    // Creating a Mongo client
            MongoClient mongo = new MongoClient("localhost", 27017);

    // Creating Credentials



    //Accessing the database
            MongoDatabase database = mongo.getDatabase("myDb");

            System.out.println("Collection created successfully");

            MongoCollection<Document> collection = database.getCollection("sampleCollection");

            System.err.println("Collection sampleCollection selected successfully");

            Document document = new Document("title", "MongoDB")
                    .append("id", 1)
                    .append("description", "database")
                    .append("likes", 100)
                    .append("url", "http://www.tutorialspoint.com/mongodb/")
                    .append("by", "tutorials point");
            collection.insertOne(document);
            System.out.println("Document inserted successfully");
        }catch(Exception ex){
            System.out.println(ex);
        }*/

    }


}