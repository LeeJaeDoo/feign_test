package test.feign.feign;

import lombok.Data;
import java.util.Date;

@Data
public class User {

    private Long idx;

    private String id;

    private String pass;

    private String name;

    private String nick_name;

    private String address;

    private Byte[] photo;

    private String tel;

    private Authority authority;

    private String token;

    private String del_yn ;

    private Date create_date;

    private Date modify_date;

    private Date expired_date;

    private Date logout_date;



}
