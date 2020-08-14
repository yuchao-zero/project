package club.banyuan.service;

import club.banyuan.entity.Books;
import java.util.List;

public interface BooksService {

  public int add(Books book);
  public int deleteById(int id);
  public int update(Books book);
  public Books findBookById(int id);
  public List<Books> findAll();
}
