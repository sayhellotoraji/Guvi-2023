package connectors;


import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class MongoDB_Connection {
   public static void main( String args[] ) {
	   	  //Step 1 -  Creating a Mongo client
	      MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	      System.out.println("Connected to the database successfully");
	       
	      
	      //Step 2 - Accessing the database
	      MongoDatabase database = mongoClient.getDatabase("test");
	      
	      
	      //Step 3 - Accessing Collection
	      MongoCollection<Document> collection = database.getCollection("Facebook");
	      
	      // Step 4 - Query the collection based on field parameter
	      Document user1 = collection.find(new Document("user_id",1)).first();
	      System.out.println(user1.toJson());
	      
	      System.out.println("\n Iterating over documents of a collection:");
	      FindIterable<Document> iterable = collection.find();
	      MongoCursor<Document> cursor = iterable.iterator();
	      
	      while(cursor.hasNext()) {
	    	  System.out.println(cursor.next().toJson());
	      }
	      
	      
	      
	   
   }
}