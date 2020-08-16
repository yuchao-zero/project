package club.banyuan.entity;

import javax.persistence.*;

public class Books {
    /**
     * 书id
     */
    @Id
    @Column(name = "bookID")
    private Integer bookid;

    /**
     * 书名
     */
    @Column(name = "bookName")
    private String bookname;

    /**
     * 数量
     */
    @Column(name = "bookCounts")
    private Integer bookcounts;

    /**
     * 描述
     */
    private String detail;

    /**
     * 获取书id
     *
     * @return bookID - 书id
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * 设置书id
     *
     * @param bookid 书id
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * 获取书名
     *
     * @return bookName - 书名
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * 设置书名
     *
     * @param bookname 书名
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * 获取数量
     *
     * @return bookCounts - 数量
     */
    public Integer getBookcounts() {
        return bookcounts;
    }

    /**
     * 设置数量
     *
     * @param bookcounts 数量
     */
    public void setBookcounts(Integer bookcounts) {
        this.bookcounts = bookcounts;
    }

    /**
     * 获取描述
     *
     * @return detail - 描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置描述
     *
     * @param detail 描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Books{" +
            "bookid=" + bookid +
            ", bookname='" + bookname + '\'' +
            ", bookcounts=" + bookcounts +
            ", detail='" + detail + '\'' +
            '}';
    }
}