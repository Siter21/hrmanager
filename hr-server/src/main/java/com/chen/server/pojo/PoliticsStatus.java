package com.chen.server.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 
 * </p>
 *
 * @author siter21
 * @since 2021-02-10
 */
@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false,of = "name")
@Accessors(chain = true)
@TableName("t_politics_status")
@ApiModel(value="PoliticsStatus对象", description="")
public class PoliticsStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "政治面貌")
    @Excel(name = "政治面貌")
    @NotNull
    private String name;

    public PoliticsStatus(@NotNull String name) {
        this.name = name;
    }
}
