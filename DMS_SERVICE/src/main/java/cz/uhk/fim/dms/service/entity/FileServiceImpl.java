package cz.uhk.fim.dms.service.entity;

import cz.uhk.fim.dms.service.api.entity.FileService;
import cz.uhk.fim.repository.dto.api.FileDTO;
import cz.uhk.fim.repository.entity.File;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public File getFileByID(Long id) {
        return null;
    }

    @Override
    public File getFileByNameUsername(String fileName, String username) {
        return null;
    }

    @Override
    public File getFileByUsername() {
        return null;
    }

    @Override
    public File addFile(FileDTO fileDto) {
        return null;
    }

    @Override
    public File deleteFileVersion(FileDTO fileDto, Long version) {
        return null;
    }

    @Override
    public List<File> findAllFiles() {
        return null;
    }
}
