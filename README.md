# JBuildPilot Templates

Official template repository for the [JBuildPilot Engine](https://github.com/rutwok-labs/jbuildpilot). 

This repository contains reusable starter projects and boilerplates for different types of Java development, pre-configured with industry best practices, modern Java toolchains, and optimized build setups.

## Available Templates

| ID | Name | Build System | Minimum Java | Description |
|---|---|---|---|---|
| `java-app` | Java Application | Maven | 21+ | Basic Java application boilerplate. |
| `paper-plugin-maven` | Paper Plugin (Maven) | Maven | 25+ | Minecraft Paper plugin targeting Paper 26.2. |
| `paper-plugin-gradle` | Paper Plugin (Gradle) | Gradle | 25+ | Minecraft Paper plugin targeting Paper 26.2 using Kotlin DSL. |

## Usage

To generate a new project from this repository, use the JBuildPilot CLI:

```bash
# List available templates
pilot template list

# Generate a new project interactively
pilot create <template-id> <project-name>
```

Example:
```bash
pilot create paper-plugin-gradle MyAwesomePlugin
```

## Structure

- `/templates/` - Contains the raw project structures.
- `registry.json` - The manifest mapping template IDs to their physical paths and metadata.

## Development

Templates in this repository utilize dynamic variable substitution (e.g., `PROJECT_NAME`, `PACKAGE_NAME`, `MAIN_CLASS`). The JBuildPilot Template Engine safely injects user-provided answers into both file contents and file/directory paths during generation.
