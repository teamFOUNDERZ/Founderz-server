package com.founderz.userinterest.domain;

import com.founderz.common.vo.tag.TagId;
import com.founderz.common.vo.user.UserId;
import com.founderz.internal.data.userinterest.UserInterestDto;

import java.util.List;

/**
 * <p>바운디드 컨텍스트: UserInterest(사용자 관심사)</p>
 * <p>책임: 사용자 관심사 데이터베이스 테이블 쓰기 작업</p>
 * <p>계층: domain</p>
 * <br/>
 *
 * <h2>제공 기능</h2>
 * <ul>
 *   <li>사용자 관심사 저장</li>
 *   <li>사용자 관심사 삭제</li>
 * </ul>
 */
public interface UserInterestDomainWriter {
    /**
     * 사용자 관심사 생성을 위한 메서드
     *
     * @param dto 사용자 관심사 도메인 정보
     */
    void save(UserInterestDto dto);

    void saveAll(List<UserInterestDto> dtoList);

    /**
     * 사용자 관심사 삭제를 위한 메서드
     *
     * @param userId 사용자 아이디
     * @param tagId 태그 아이디
     */
    void delete(UserId userId, TagId tagId);
}
