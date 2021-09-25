package kz.iitu.dbstructservice.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class News {
    private Long id;
    private String title;
    private String description;
    private String newsBody;
    private Timestamp newsTime;
}
