package ua.ithillel.oop.config;

public class ProgramConfig {
    private String programName;
    private String username;
    private String credential; // optinal
    private String configPath; // optional

    private ProgramConfig() {}

    public static ProgramConfigBuilder builder() {
        return new ProgramConfigBuilder();
    }

    public static class ProgramConfigBuilder {
        private ProgramConfig instance = new ProgramConfig();

        public ProgramConfigBuilder setProgramName(String programName) {
            if (programName.length() > 16) {
                throw new IllegalArgumentException("Program Name is too long");
            }
            instance.programName = programName;
            return this;
        }

        public ProgramConfigBuilder setUsername(String username) {
            instance.username = username;
            return this;
        }

        public ProgramConfigBuilder setCredential(String credential) {
            instance.credential = credential;
            return this;
        }

        public ProgramConfigBuilder setConfigPath(String configPath) {
            instance.configPath = configPath;
            return this;
        }

        public ProgramConfig build() {
            return instance;
        }
    }


    //    public ProgramConfig(String programName, String username) {
//        this.programName = programName;
//        this.username = username;
//        this.credential = "default";
//        this.configPath = "src/main/resources/config.json";
//    }
//
//    public ProgramConfig(String programName, String username, String credential) {
//        this.programName = programName;
//        this.username = username;
//        this.credential = credential;
//    }
//
//    public ProgramConfig(String programName, String username, String credential, String configPath) {
//        this.programName = programName;
//        this.username = username;
//        this.credential = credential;
//        this.configPath = configPath;
//    }
//
//    public ProgramConfig(String programName) {
//        this.programName = programName;
//    }
//


    public String getProgramName() {
        return programName;
    }

    public String getUsername() {
        return username;
    }

    public String getCredential() {
        return credential;
    }

    public String getConfigPath() {
        return configPath;
    }
}
