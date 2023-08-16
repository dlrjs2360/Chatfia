package com.springles.service;

import com.springles.domain.dto.member.MemberCreateResponse;
import com.springles.domain.dto.member.MemberDeleteResponse;
import com.springles.domain.dto.member.MemberUpdateResponse;

public interface MemberService {

    public String signUp(MemberCreateResponse member);

    public String updateInfo(MemberUpdateResponse memberDetails, Long memberId);

    public void signOut(MemberDeleteResponse memberDetails, Long memberId);

    public boolean memberExists(String memberName);
}
