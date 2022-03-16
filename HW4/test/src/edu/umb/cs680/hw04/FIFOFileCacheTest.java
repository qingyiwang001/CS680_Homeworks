package edu.umb.cs680.hw04;

import java.io.IOException;
import java.nio.file.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw04.FIFOFileCache;

class FIFOFileCacheTest {
	private static FIFOFileCache cache;
	private static Path p1;
	private static Path p2;
	private static Path p3;
	private static Path p4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cache = new FIFOFileCache(3);
		p1 = Paths.get("filesfortesting/file1.txt");
		p2 = Paths.get("filesfortesting/file2.txt");
		p3 = Paths.get("filesfortesting/file3.txt");
		p4 = Paths.get("filesfortesting/file4.txt");
		cache.fetch(p1);
		cache.fetch(p2);
		cache.fetch(p3);
	}

	@Test
	public void fetchwithp1() throws IOException {
		assertEquals(Files.readString(p1), cache.fetch(p1));
	}
	
	@Test
	public void fetchwithp2() throws IOException {
		assertEquals(Files.readString(p2), cache.fetch(p2));
	}
	
	@Test
	public void fetchwithp3() throws IOException {
		assertEquals(Files.readString(p3), cache.fetch(p3));
	}
	
	@Test
	public void fetchwithp4() throws IOException {
		assertEquals(Files.readString(p4), cache.fetch(p4));
		
	}

}
