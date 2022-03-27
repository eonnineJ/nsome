package com.app.nsome.admin.record.service;

import com.app.nsome.admin.record.dto.RecordAuthDto;
import com.app.nsome.admin.record.dto.RecordLoginDto;
import com.app.nsome.admin.record.dto.RecordMemberDto;
import com.app.nsome.admin.record.dto.RecordPaymentDto;

public interface RecordService {
    public RecordLoginDto getLoginRecords();
    public RecordPaymentDto getPaymentRecords();
    public RecordAuthDto getAuthRecords();
    public RecordMemberDto getChangeMemberRecords();
}
