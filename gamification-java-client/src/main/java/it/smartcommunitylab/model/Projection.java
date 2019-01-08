/**
 * Copyright 2018-2019 SmartCommunity Lab(FBK-ICT).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/*
 * Gamification Engine API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.smartcommunitylab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * Projection
 */

public class Projection {
  @SerializedName("include")
  private List<String> include = new ArrayList<String>();

  @SerializedName("exclude")
  private List<String> exclude = new ArrayList<String>();

  public Projection include(List<String> include) {
    this.include = include;
    return this;
  }

  public Projection addIncludeItem(String includeItem) {
    this.include.add(includeItem);
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getInclude() {
    return include;
  }

  public void setInclude(List<String> include) {
    this.include = include;
  }

  public Projection exclude(List<String> exclude) {
    this.exclude = exclude;
    return this;
  }

  public Projection addExcludeItem(String excludeItem) {
    this.exclude.add(excludeItem);
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getExclude() {
    return exclude;
  }

  public void setExclude(List<String> exclude) {
    this.exclude = exclude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Projection projection = (Projection) o;
    return Objects.equals(this.include, projection.include) &&
        Objects.equals(this.exclude, projection.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, exclude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Projection {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
