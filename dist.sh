#!/bin/bash

# Making distributable folder
rm -r dist
rm StructuredLearning.zip
mkdir dist

# Copying the project into the distributable
cp -r StructuredLearningProject dist

# Removing unnnecessary folders from distributable
rm -r dist/StructuredLearningProject/.settings
rm -r dist/StructuredLearningProject/bin
rm dist/StructuredLearningProject/.gitignore

zip -r -X StructuredLearning.zip dist/StructuredLearningProject
