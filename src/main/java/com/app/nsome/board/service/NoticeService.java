package com.app.nsome.board.service;

import com.app.nsome.board.dto.NoticeDto;

public interface NoticeService {
    public NoticeDto write();
    public NoticeDto read();
    public NoticeDto change();
    public int delete();


}
