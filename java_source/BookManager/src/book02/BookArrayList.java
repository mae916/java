package book02;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {
		private ArrayList <Book> bookList;
		
		public BookArrayList() {
			bookList = new ArrayList<Book>();
		}
		
		// 도서 추가
			public void addBook(Book book) {
				bookList.add(book);
			}
			
			// 도서 삭제
			public boolean removeBook(int booknumber) {
				Iterator<Book> iterator = bookList.iterator();
				while(iterator.hasNext()) {
					Book book = iterator.next();
					int getNum = book.getBookNumber();
					if(booknumber == getNum) {
						bookList.remove(book);
						return true;
					}
				}
				System.out.println(booknumber + "가 존재하지 않습니다.");
				return false;
			}
				 
			//대출상태
			// String a = (isCheckOut()) ? "대출가능" : "대출불가";
		
			//도서검색
			//List<String> list = new ArrayList<>(Arrays.asList("Hello", "Hi"));
			// 포함 여부 체크
			boolean isContainsHello = bookList.contains("설명서");
			boolean isContainsBye = bookList.contains("행복");
			
			public void showAllBook() {
				System.out.println(" 등록번호   |    서명   |    저자   |    출판사   |    대출여부   |    청구기호 ");
				for(Book book : bookList) {
					System.out.println(book);
				}
			}
}
