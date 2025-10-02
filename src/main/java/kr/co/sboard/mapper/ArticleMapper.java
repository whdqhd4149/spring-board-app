package kr.co.sboard.mapper;

import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.CommentDTO;
import kr.co.sboard.dto.PageRequestDTO;
import kr.co.sboard.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {



    // @Param : Mybatis SQL 매퍼파일(xml)에서 해당 매개변수를 참조할 수 있는 애노테이션, 반드시 선언
    public List<ArticleDTO> selectAll(@Param("pageRequestDTO") PageRequestDTO pageRequestDTO);
    public int selectCountTotal(@Param("pageRequestDTO") PageRequestDTO pageRequestDTO);


}
