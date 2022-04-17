package xyz.intellij.session;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBMock {

    private List<BookEntity> bookEntityList = new ArrayList<>();

    DBMock() {
        this.bookEntityList = new ArrayList<>();
        this.bookEntityList.add(new BookEntity("1", "穷爸爸，富爸爸"));
        this.bookEntityList.add(new BookEntity("2", "我的奋斗"));
        this.bookEntityList.add(new BookEntity("3", "毛泽东传"));
    }

    public BookEntity getOneBook(String id) {
        List<BookEntity> bookEntityList1 = bookEntityList.stream().filter(bookEntity -> bookEntity.getId().equals(id)).collect(Collectors.toList());
        if (bookEntityList1.size() == 1) {
            return bookEntityList1.get(0);
        }
        return null;
    }
    public List<BookEntity> getAll(){
        return this.bookEntityList;
    }
}
