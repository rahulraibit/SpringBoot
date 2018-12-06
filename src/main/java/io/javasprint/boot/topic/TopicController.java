package io.javasprint.boot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/alltopics")
	public List<Topic> getAllTopics() {
		List<Topic> data  = new ArrayList<Topic>() {{add(new Topic("a","b", "c"));}};
	    return data;
	}
}
