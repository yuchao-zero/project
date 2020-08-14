package club.banyuan.controller;

import club.banyuan.entity.Books;
import club.banyuan.service.BooksService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
   * @param model
   * @return
   */
  @RequestMapping("/allBooks")
  public String allBooks(Model model){
    List<Books> books = booksService.findAll();
    model.addAttribute("books",books);
    return "booksList";
  }

//  @RequestMapping("/addBook")
//  public String addBook(){
//
//  }
}
