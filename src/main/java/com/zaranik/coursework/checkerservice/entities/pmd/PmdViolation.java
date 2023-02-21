package com.zaranik.coursework.checkerservice.entities.pmd;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.zaranik.coursework.checkerservice.entities.BaseEntity;
import com.zaranik.coursework.checkerservice.entities.checkstyle.CheckstyleSourceFile;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "pmd_violations")
@NoArgsConstructor
@AllArgsConstructor
public class PmdViolation extends BaseEntity {

  @Column(name = "value")
  private String value;

  @Column(name = "begin_line")
  private Integer beginLine;

  @Column(name = "end_line")
  private Integer endLine;

  @Column(name = "rule_name")
  private String ruleName;

  @Column(name = "package_name")
  private String packageName;

  @Column(name = "class_name")
  private String className;

  @Column(name = "method_name")
  private String methodName;

  @ManyToOne
  @JsonBackReference
  @JoinColumn(name = "file_id")
  private PmdReportSourceFile file;


}
