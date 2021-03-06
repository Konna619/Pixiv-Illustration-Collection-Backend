package dev.cheerfun.pixivic.biz.web.user.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author OysterQAQ
 * @version 1.0
 * @date 2019/09/19 9:29
 * @description Bookmark
 */
@Data
@NoArgsConstructor
public class BookmarkRelation {
    private int id;
    @NotBlank
    private String username;
    @NotBlank
    private int userId;
    @NotBlank
    private int illustId;
}
