package tech.wangy265.springboot.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * user.
 *
 * @author wang
 */
@Data
@Builder
public class UserVo {

    private String name;

    private int age;

    private AddressVo address;
}