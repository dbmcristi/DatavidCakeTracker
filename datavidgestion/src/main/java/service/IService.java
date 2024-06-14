package service;

import domain.Member;
import dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.IMemberRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IService {
    @Autowired
    IMemberRepo memberRepo;

    public MemberDto saveMember(MemberDto dto) {
        Member u = new Member(dto.getFirstName(), dto.getLastName(),dto.getBirthDay());
        Member out = memberRepo.save(u);
        return new MemberDto(u.getId(), u.getFirstName(),u.getLastName(),u.getBirthday());
    }

    public List<MemberDto> getAllRace() {
        return memberRepo.findAll().stream()
                .map(entity -> new MemberDto(entity.getId(), entity.getFirstName(), entity.getLastName(),entity.getBirthday()))
                .collect(Collectors.toList());
    }

}
