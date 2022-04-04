package edu.umb.cs680.hw08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw08.APFS;
import edu.umb.cs680.hw08.ApfsDirectory;
import edu.umb.cs680.hw08.FSElement;

public class APFSTest {

	@Test
	public void getFileSystemReturnNonNullValue() {
		assertNotNull(APFS.getApfs());
	}

	@Test
	public void getFileSystemReturnIdenticalInstance() {
		APFS a1 = APFS.getApfs();
		APFS a2 = APFS.getApfs();
		assertSame(a1, a2);
	}
	
	@Test
	public void initMethodAndGetRootDirTesting() {
		APFS apfs = APFS.getApfs();
		FSElement expected = apfs.init("apfs", 1000);
		ApfsDirectory actual = apfs.getRootDir();
		assertSame(expected, actual);
	}

}
