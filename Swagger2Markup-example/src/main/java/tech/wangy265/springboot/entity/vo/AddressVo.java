package tech.wangy265.springboot.entity.vo;

import lombok.Builder;
import lombok.Data;

/**
 * address.
 *
 * @author wang
 */
@Data
@Builder
public class AddressVo {

    private String city;

    private String zipcode;
}