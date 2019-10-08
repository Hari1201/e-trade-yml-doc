package org.xmltoyaml.docconverter;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.XML;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public final class DocConverter {
  
  private static String yaml;
  private static String url = "C:/Users/harikrishnan_r/Hari/yaml_files/file.yml";
  public static void main(String args[]) throws IOException, URISyntaxException {
    
    ClassLoader classLoader = DocConverter.class.getClassLoader();

    try (InputStream inputStream = classLoader.getResourceAsStream("xml/data.xml")) {

      String result = IOUtils.toString(inputStream);
      convertObjectToYaml(result);

    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  public static String convertObjectToYaml(String ymlXml) throws IOException, URISyntaxException {
   
    JSONObject xmlJSONObj = XML.toJSONObject(ymlXml);
    String json = xmlJSONObj.toString();
    JsonNode jsonNode = new ObjectMapper().readTree(json);
    yaml = new YAMLMapper().writeValueAsString(jsonNode);
    Files.write(Paths.get(url), yaml.getBytes());
    return yaml;
  }


  
  
  /*
   * 
   * private static String yaml; private static String url =
   * "C:/Users/harikrishnan_r/Hari/yaml_files/file.yml";
   * 
   * public static void main(String args[]) throws IOException, URISyntaxException { YamlObject
   * yamlObject = new YamlObject(); convertObjectToYaml(yamlObject); }
   * 
   * public static String convertObjectToYaml(YamlObject yamlObject) throws IOException,
   * URISyntaxException {
   * 
   * 
   * 
   * ObjectMapper Obj = new ObjectMapper(); String jsonStr = Obj.writeValueAsString(yamlObject);
   * JsonNode jsonNode = new ObjectMapper().readTree(jsonStr); yaml = new
   * YAMLMapper().writeValueAsString(jsonNode); Files.write(Paths.get(url), yaml.getBytes());
   * 
   * return yaml; }
   * 
   */}
