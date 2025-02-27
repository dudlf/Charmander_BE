package org.cm.domain.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project extends BaseEntity {
  @ManyToOne
  @JoinColumn(name = "owner_id", nullable = false, updatable = false)
  private Member owner;

  @Column(nullable = false)
  private String name;
}
