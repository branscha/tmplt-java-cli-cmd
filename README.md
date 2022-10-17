# Java CLI Command
## What

Template for a Java CLI Command. Copy the template and adjust to your own needs.

* Rename hello.sh to [command].sh
   * Do not modify its contents
* Adjust the contents of run-env.sh, this contains the customizations.
* Leave run-java.sh as it is. No changes should be necessary.

## Extra environment variables

* Many many options can be set: https://github.com/fabric8io-images/run-java-sh/blob/master/fish-pepper/run-java-sh/readme.md
* SHOW_COMMAND: Set to 1 to see final command. Leave empty to stay silent.

## Packaging

    mvn clean package assembly:single
