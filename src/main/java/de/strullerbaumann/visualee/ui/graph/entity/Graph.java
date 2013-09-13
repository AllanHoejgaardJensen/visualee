/*
 Copyright 2013 Thomas Struller-Baumann, struller-baumann.de

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package de.strullerbaumann.visualee.ui.graph.entity;

import de.strullerbaumann.visualee.dependency.boundary.DependencyFilter;
import java.io.File;
import java.io.InputStream;

/**
 *
 * @author Thomas Struller-Baumann <thomas at struller-baumann.de>
 */
public class Graph {

   private int distance;
   private int linkdistance;
   private int gravity;
   private int graphSize;
   private int fontsize;
   private File htmlFile;
   private InputStream htmlTemplateIS;
   private File jsonFile;
   private String name;
   private String title;
   private DependencyFilter dependencyFilter;

   public int getDistance() {
      return distance;
   }

   public String getDistanceString() {
      return Integer.toString(distance);
   }

   public void setDistance(int distance) {
      this.distance = distance;
   }

   public int getLinkdistance() {
      return linkdistance;
   }

   public String getLinkdistanceString() {
      return Integer.toString(linkdistance);
   }

   public void setLinkdistance(int linkdistance) {
      this.linkdistance = linkdistance;
   }

   public int getGravity() {
      return gravity;
   }

   public String getGravityString() {
      return Integer.toString(gravity);
   }

   public void setGravity(int gravity) {
      this.gravity = gravity;
   }

   public int getGraphSize() {
      return graphSize;
   }

   public String getGraphSizeString() {
      return Integer.toString(graphSize);
   }

   public void setGraphSize(int graphSize) {
      this.graphSize = graphSize;
   }

   public int getFontsize() {
      return fontsize;
   }

   public String getFontsizeString() {
      return Integer.toString(fontsize);
   }

   public void setFontsize(int fontsize) {
      this.fontsize = fontsize;
   }

   public File getHtmlFile() {
      return htmlFile;
   }

   public void setHtmlFile(File htmlFile) {
      this.htmlFile = htmlFile;
   }

   public InputStream getHtmlTemplateIS() {
      return htmlTemplateIS;
   }

   public void setHtmlTemplateIS(InputStream htmlTemplateIS) {
      this.htmlTemplateIS = htmlTemplateIS;
   }

   public File getJsonFile() {
      return jsonFile;
   }

   public void setJsonFile(File jsonFile) {
      this.jsonFile = jsonFile;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public DependencyFilter getDependencyFilter() {
      return dependencyFilter;
   }

   public void setDependencyFilter(DependencyFilter dependencyFilter) {
      this.dependencyFilter = dependencyFilter;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
