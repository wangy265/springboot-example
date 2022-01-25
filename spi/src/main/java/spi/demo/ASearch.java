package spi.demo;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ASearch implements Search{

	@Override
	public List<String> searchDoc(String keyword) {
		log.info("A search");
		return new ArrayList<>();
	}

}
