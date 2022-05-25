package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseAttributes {

    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

}
