package net.javapedia.jsontoxmlconverter.controller;

import net.javapedia.jsontoxmlconverter.model.PreDisclosureModel;
import net.javapedia.jsontoxmlconverter.model.RequestModel;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONToXMLMappingController {

    @PostMapping(path = "/mapJsontoXML", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody PreDisclosureModel mapJsonToXML(@RequestBody final PreDisclosureModel request) {
        return request;
    }

    @PostMapping(path = "/mapJsontoXMLR", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody RequestModel mapJsonToXML(@RequestBody final RequestModel request) {
        return request;
    }

    @PostMapping(path = "/mapXMLtoJson", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody RequestModel mapXMLtoJson(@RequestBody final RequestModel request) {
        return request;
    }
}
