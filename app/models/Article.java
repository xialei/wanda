package models;

import java.util.Date;
import java.util.List;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.ObjectId;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.modules.mongodb.jackson.MongoDB;

public class Article {

	@Id
	@ObjectId
	public String id;

	//@Constraints.Required
	//@Formats.NonEmpty
	public String title;

	//@Constraints.Required
	public String content;

	public String pub;

	public Date pdt;

	public Date crt;

	// -- Queries

	private static JacksonDBCollection<Article, String> coll = MongoDB
			.getCollection("articles", Article.class, String.class);

	/**
	 * Retrieve all users.
	 */
	public static List<Article> findAll() {
		return coll.find().toArray();
	}

	public static Article findById(String id) {
		return coll.findOneById(id);
	}

	public static void save(Article article) {
		coll.save(article);
	}

	public static void update(String id, Article article) {
		coll.updateById(id, article);
	}

	public static void removeById(String id) {
		coll.removeById(id);
	}

	// --

}
