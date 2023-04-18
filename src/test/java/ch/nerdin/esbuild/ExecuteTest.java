package ch.nerdin.esbuild;

import ch.nerdin.esbuild.modal.EsBuildConfig;
import ch.nerdin.esbuild.resolve.DownloadResolver;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

public class ExecuteTest {

    @Test
    public void shouldExecuteEsBuild() throws IOException {
        final EsBuildConfig esBuildConfig = new EsBuildConfig();
        esBuildConfig.setVersion(true);
        final Path path = new DownloadResolver(null).resolve(Bundler.ESBUILD_VERSION);
        new Execute(path.toFile(), esBuildConfig).executeAndWait();
    }
}
