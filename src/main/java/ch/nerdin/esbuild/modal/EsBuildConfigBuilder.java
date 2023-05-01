package ch.nerdin.esbuild.modal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ch.nerdin.esbuild.modal.EsBuildConfig.Loader.FILE;
import static ch.nerdin.esbuild.modal.EsBuildConfig.Loader.JS;
import static ch.nerdin.esbuild.modal.EsBuildConfig.Loader.JSON;
import static ch.nerdin.esbuild.modal.EsBuildConfig.Loader.JSX;
import static ch.nerdin.esbuild.modal.EsBuildConfig.Loader.TS;
import static ch.nerdin.esbuild.modal.EsBuildConfig.Loader.TSX;

public class EsBuildConfigBuilder {
    private final EsBuildConfig esBuildConfig;

    public EsBuildConfigBuilder() {
        this.esBuildConfig = new EsBuildConfig();
        initDefault();
    }

    private void initDefault() {
        this.bundle()
            .minify()
            .sourceMap()
            .splitting()
            .format(EsBuildConfig.Format.ESM)
            .loader(getDefaultLoadersMap());
    }

    public static Map<String, EsBuildConfig.Loader> getDefaultLoadersMap() {
        Map<String, EsBuildConfig.Loader> loaders = new HashMap<>();
        loaders.put(".json", JSON);
        loaders.put(".jsx", JSX);
        loaders.put(".tsx", TSX);
        loaders.put(".ts", TS);
        loaders.put(".js", JS);
        loaders.put(".svg", FILE);
        loaders.put(".gif", FILE);
        loaders.put(".png", FILE);
        loaders.put(".jpg", FILE);
        loaders.put(".woff", FILE);
        loaders.put(".woff2", FILE);
        loaders.put(".ttf", FILE);
        loaders.put(".eot", FILE);
        return loaders;
    }

    public EsBuildConfigBuilder bundle() {
        esBuildConfig.setBundle(true);
        return this;
    }

    public EsBuildConfigBuilder entryPoint(String[] entryPoint) {
        esBuildConfig.setEntryPoint(entryPoint);
        return this;
    }

    public EsBuildConfigBuilder minify() {
        esBuildConfig.setMinify(true);
        return this;
    }

    public EsBuildConfigBuilder minify(boolean minify) {
        esBuildConfig.setMinify(minify);
        return this;
    }

    public EsBuildConfigBuilder version() {
        esBuildConfig.setVersion(true);
        return this;
    }

    public EsBuildConfigBuilder substitutes(Map<String, String> substitutes) {
        esBuildConfig.setSubstitutes(substitutes);
        return this;
    }

    public EsBuildConfigBuilder excludes(List<String> excludes) {
        esBuildConfig.setExcludes(excludes);
        return this;
    }

    public EsBuildConfigBuilder format(EsBuildConfig.Format format) {
        esBuildConfig.setFormat(format);
        return this;
    }

    public EsBuildConfigBuilder loader(Map<String, EsBuildConfig.Loader> loader) {
        esBuildConfig.setLoader(loader);
        return this;
    }

    public EsBuildConfigBuilder outDir(String outDir) {
        esBuildConfig.setOutDir(outDir);
        return this;
    }

    public EsBuildConfigBuilder packages(String packages) {
        esBuildConfig.setPackages(packages);
        return this;
    }

    public EsBuildConfigBuilder platform(EsBuildConfig.Platform platform) {
        esBuildConfig.setPlatform(platform);
        return this;
    }

    public EsBuildConfigBuilder serve() {
        esBuildConfig.setServe(true);
        return this;
    }

    public EsBuildConfigBuilder sourceMap() {
        esBuildConfig.setSourceMap(true);
        return this;
    }

    public EsBuildConfigBuilder sourceMap(boolean sourceMap) {
        esBuildConfig.setSourceMap(sourceMap);
        return this;
    }

    public EsBuildConfigBuilder splitting() {
        esBuildConfig.setSplitting(true);
        return this;
    }

    public EsBuildConfigBuilder splitting(boolean splitting) {
        esBuildConfig.setSplitting(splitting);
        return this;
    }

    public EsBuildConfigBuilder target(EsBuildConfig.Target target) {
        esBuildConfig.setTarget(target);
        return this;
    }

    public EsBuildConfigBuilder watch() {
        esBuildConfig.setWatch(true);
        return this;
    }

    public EsBuildConfig build() {
        return esBuildConfig;
    }
}
