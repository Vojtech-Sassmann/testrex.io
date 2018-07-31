package eu.testresults.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * TestSuite
 */
@Validated
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-30T21:24:04.222Z")
public class TestSuite   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("group")
  private String group = null;

  @JsonProperty("tests")
  private Integer tests = null;

  @JsonProperty("failures")
  private Integer failures = null;

  @JsonProperty("errors")
  private Integer errors = null;

  @JsonProperty("skipped")
  private Integer skipped = null;

  @JsonProperty("time")
  private BigDecimal time = null;

  @JsonProperty("labels")
  @Valid
  private List<String> labels = null;

  @JsonProperty("project_id")
  private String projectId = null;

  @JsonProperty("properties_array")
  @Valid
  private List<Properties> propertiesArray = null;

  @JsonProperty("testcases")
  @Valid
  private List<TestCase> testcases = null;

  public TestSuite name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestSuite group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public TestSuite tests(Integer tests) {
    this.tests = tests;
    return this;
  }

  /**
   * Get tests
   * @return tests
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getTests() {
    return tests;
  }

  public void setTests(Integer tests) {
    this.tests = tests;
  }

  public TestSuite failures(Integer failures) {
    this.failures = failures;
    return this;
  }

  /**
   * Get failures
   * @return failures
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getFailures() {
    return failures;
  }

  public void setFailures(Integer failures) {
    this.failures = failures;
  }

  public TestSuite errors(Integer errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getErrors() {
    return errors;
  }

  public void setErrors(Integer errors) {
    this.errors = errors;
  }

  public TestSuite skipped(Integer skipped) {
    this.skipped = skipped;
    return this;
  }

  /**
   * Get skipped
   * @return skipped
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getSkipped() {
    return skipped;
  }

  public void setSkipped(Integer skipped) {
    this.skipped = skipped;
  }

  public TestSuite time(BigDecimal time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }

  public TestSuite labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public TestSuite addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public TestSuite projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public TestSuite propertiesArray(List<Properties> propertiesArray) {
    this.propertiesArray = propertiesArray;
    return this;
  }

  public TestSuite addPropertiesArrayItem(Properties propertiesArrayItem) {
    if (this.propertiesArray == null) {
      this.propertiesArray = new ArrayList<Properties>();
    }
    this.propertiesArray.add(propertiesArrayItem);
    return this;
  }

  /**
   * Get propertiesArray
   * @return propertiesArray
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Properties> getPropertiesArray() {
    return propertiesArray;
  }

  public void setPropertiesArray(List<Properties> propertiesArray) {
    this.propertiesArray = propertiesArray;
  }

  public TestSuite testcases(List<TestCase> testcases) {
    this.testcases = testcases;
    return this;
  }

  public TestSuite addTestcasesItem(TestCase testcasesItem) {
    if (this.testcases == null) {
      this.testcases = new ArrayList<TestCase>();
    }
    this.testcases.add(testcasesItem);
    return this;
  }

  /**
   * Get testcases
   * @return testcases
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<TestCase> getTestcases() {
    return testcases;
  }

  public void setTestcases(List<TestCase> testcases) {
    this.testcases = testcases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuite testSuite = (TestSuite) o;
    return Objects.equals(this.name, testSuite.name) &&
        Objects.equals(this.group, testSuite.group) &&
        Objects.equals(this.tests, testSuite.tests) &&
        Objects.equals(this.failures, testSuite.failures) &&
        Objects.equals(this.errors, testSuite.errors) &&
        Objects.equals(this.skipped, testSuite.skipped) &&
        Objects.equals(this.time, testSuite.time) &&
        Objects.equals(this.labels, testSuite.labels) &&
        Objects.equals(this.projectId, testSuite.projectId) &&
        Objects.equals(this.propertiesArray, testSuite.propertiesArray) &&
        Objects.equals(this.testcases, testSuite.testcases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, group, tests, failures, errors, skipped, time, labels, projectId, propertiesArray, testcases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSuite {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    propertiesArray: ").append(toIndentedString(propertiesArray)).append("\n");
    sb.append("    testcases: ").append(toIndentedString(testcases)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
