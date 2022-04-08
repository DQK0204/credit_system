package com.CreditSystem.Service.AdminService;

import com.CreditSystem.common.Result;
import com.CreditSystem.pojo.Notice;

import java.util.List;

public interface NoticeManageService {
    //6	查看历史公告列表
    Result<List<Notice>> getNoticeList();

    //7	添加新历史公告
    Result addNotice(Notice notice);

    //8	修改历史公告
    Result updateNotice(int notice_id);

    //9	隐藏历史公告
    Result hideNotice(int notice_id);

    //10	显示历史公告
    Result showNotice(int notice_id);

    //11	删除历史公告
    Result deleteNotice(int notice_id);

}
