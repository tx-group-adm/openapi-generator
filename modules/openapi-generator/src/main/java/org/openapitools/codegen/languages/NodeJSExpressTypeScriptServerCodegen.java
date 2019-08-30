package org.openapitools.codegen.languages;

import org.openapitools.codegen.*;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.MapProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.parameters.Parameter;

import java.io.File;
import java.util.*;

import org.apache.commons.lang3.StringUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeJSExpressTypeScriptServerCodegen extends DefaultCodegen implements CodegenConfig {
    public static final String PROJECT_NAME = "projectName";

    static Logger LOGGER = LoggerFactory.getLogger(NodeJSExpressTypeScriptServerCodegen.class);

    public CodegenType getTag() {
        return CodegenType.SERVER;
    }

    public String getName() {
        return "nodejsexpresstypescript";
    }

    public String getHelp() {
        return "Generates a nodejsexpresstypescript server.";
    }

    public NodeJSExpressTypeScriptServerCodegen() {
        super();

        outputFolder = "generated-code" + File.separator + "nodejsexpresstypescript";
        modelTemplateFiles.put("model.mustache", ".zz");
        apiTemplateFiles.put("api.mustache", ".zz");
        embeddedTemplateDir = templateDir = "nodejsexpresstypescript-server";
        apiPackage = File.separator + "Apis";
        modelPackage = File.separator + "Models";
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        // TODO: Fill this out.
    }
}
