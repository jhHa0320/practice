// 성능 개선: 기존 for loop 제거하고 bulk select로 변경함
public List<Member> getAllMembers() {
    return memberRepository.findAllWithFetchJoin(); // 가상의 메서드
} // 안녕하세요