DESCRIPTION = " Print data recipe "
LICENSE = "MIT"

SRC_URI = "file://src   \
          "

FILESPATH:prepend = "${THISDIR}/files:"
S = "${WORKDIR}/src"

inherit dpkg
