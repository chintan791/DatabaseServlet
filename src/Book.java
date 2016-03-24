public class Book {



		private String sku;
		private String bookTitle;
		private String author;
		private String description;
		private double price;
		private boolean isInStock;
		private int stock;
		
		Book(){}

		public Book(String sku1, String firstBook, String firstAuthor, String firstDescription, double firstPrice,boolean firstIsInStock, int firstStock) {
		   setSku(sku1);
			bookTitle= firstBook;
		   author = firstAuthor;
		   description= firstDescription;
		   price=firstPrice; 
		   isInStock=firstIsInStock;
		   stock=firstStock;
		}


		public String getBookTitle() {
			return bookTitle;
		}


		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}


		public String getAuthor() {
			return author;
		}


		public void setAuthor(String author) {
			this.author = author;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public boolean isInStock() {
			return isInStock;
		}


		public void setInStock(boolean isInStock) {
			this.isInStock = isInStock;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		} 
	
		public String getDisplayText(){
			
			return ("author: "+ author + "title: "+ bookTitle + "description:" + description) ;
		}
		

		public double getCostOfBooks(double noOfBooks){
			
		

		if (isInStock == true){
		
			return (price*noOfBooks) ;
		}else{
			return price;
		}
		
	
	
		}

		public String getSku() {
			return sku;
		}

		public void setSku(String sku) {
			this.sku = sku;
		}

	}

