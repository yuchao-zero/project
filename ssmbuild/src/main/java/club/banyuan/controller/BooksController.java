package club.banyuan.controller;

import club.banyuan.entity.Books;
import club.banyuan.service.BooksService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/14 14:45
 */
@Controller
public class BooksController {

  @Resource
  private BooksService booksService;

  /**
   * 查询所有
   *
   * @param model
   * @return
   */
  @RequestMapping("/allBooks")
  public String allBooks(Model model) {
    List<Books> books = booksService.findAll();
    model.addAttribute("books", books);
    return "booksList";
  }

  /**
   * 跳转到增加页面
   *
   * @return
   */
  @RequestMapping("/toAddBook")
  public String toAddBook() {
    return "addBook";
  }

  /**
   * 增加页面
   *
   * @param book
   * @return
   */
  @RequestMapping("/addBook")
  public String addBook(Books book) {
    booksService.add(book);
    return "redirect:allBooks";
  }

  /**
   * 跳转到修改页面
   *
   * @return
   */
  @RequestMapping("/toUpdate")
  public String toUpdate(int id, Model model) {
    System.out.println("要修改的商品的id为："+id);
    Books updateBook = booksService.findBookById(id);
    model.addAttribute("QBook", updateBook);
    return "updateBook";
  }

  @RequestMapping("/updateBook")
  public String updateBook(Books book) {
    System.out.println("updateBookId=>" + book.getBookid());
    booksService.update(book);
    return "redirect:allBooks";
  }

  @RequestMapping("/deleteBook")
  public String deleteBook(int id){
    booksService.deleteById(id);
    return "redirect:allBooks";
  }
}
