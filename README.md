Instructions: In Eclipse, or an IDE of your choice, write the code that accomplishes the objectives listed below. Ensure that the code compiles and runs as directed. Take screenshots of the code and of the running program (make sure to get screenshots of all required functionality) and paste them in this document where instructed below. Create a new repository on GitHub for this week’s assignments and push this document to the repository. Additionally, push an .sql file with all your queries and your Java project code to the same repository.  Add the URL for this week’s repository to this document where instructed and submit this document to your instructor when complete.
Coding Steps:
In this week's coding activity, you will create a menu driven application backed by a MySQL database.

To start, choose one item that you like. It could be vehicles, sports, foods, etc....
Create a new Java project in Eclipse.
Create a SQL script in the project to create a database with one table. The table should be the item you picked.
Write a Java menu driven application that allows you to perform all four CRUD operations on your table.

Tips:
The application does not need to be as complex as the example in the video curriculum.
You need an option for each of the CRUD operations (Create, Read, Update, and Delete).
Remember that PreparedStatment.executeQuery() is only for Reading data and .executeUpdate() is used for Creating, Updating, and Deleting data.
Remember that both parameters on PreparedStatements and the ResultSet columns are based on indexes that start with 1, not 0.
