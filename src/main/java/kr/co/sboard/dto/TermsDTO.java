package kr.co.sboard.dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.sboard.entity.Terms;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class TermsDTO {


    private int no;
    private String terms;
    private String privacy;

    public Terms toEntity() {
        return  Terms.builder()
                .no(no)
                .terms(terms)
                .privacy(privacy)
                .build();
    }
}
