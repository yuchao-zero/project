package club.banyuan.service.impl;

import club.banyuan.entity.Books;
import club.banyuan.mapper.BooksMapper;
import club.banyuan.service.BooksService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :yu
 * @description : TODO
 * @date :2020/8/14 14:12
 */
@Service
public class BookServiceImpl implements BooksService {

  @Resource
  private BooksMapper booksMapper;

  @Override
  public int add(Books book) {
    return booksMapper.insert(book);
  }

  @Override
  public int deleteById(int id) {
    return booksMapper.deleteByPrimaryKey(id);
  }

  @Override
  public int update(Books book) {
    return booksMapper.updateByPrimaryKey(book);
  }

  @Override
  public Books findBookById(int id) {
    return booksMapper.selectByPrimaryKey(id);
  }

  @Override
  public List<Books> findAll() {
    return booksMapper.selectAll();
  }
}
