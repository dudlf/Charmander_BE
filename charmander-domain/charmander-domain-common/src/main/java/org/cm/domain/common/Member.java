package org.cm.domain.common;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity(name = "member")
public class Member extends BaseEntity {
    @OneToMany(mappedBy = "owner")
    @Setter
    private List<Project> projects = new ArrayList<>();

    //jpa스럽게 domain스럽게
    @Embedded
    private Principal principal;

    @Embedded
    private PersonalInfo personalInfo;

    private String phoneNumber;

    @Column(nullable = true)
    public String profileImage;

    //약관동의를 한 유저라는것을 컬럼으로 나타내야하는가

}
