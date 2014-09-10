package com.frostwire.jlibtorrent;

import com.frostwire.jlibtorrent.swig.libtorrent;
import com.frostwire.jlibtorrent.swig.torrent_info;

import java.io.File;

public final class TorrentInfo {

    private final torrent_info ti;

    private final String name;
    private final String infoHash;

    public TorrentInfo(torrent_info ti) {
        this.ti = ti;

        this.name = this.ti.name();
        this.infoHash = libtorrent.to_hex(this.ti.info_hash().to_string());
    }

    public TorrentInfo(File torrentFile) {
        this(new torrent_info(torrentFile.getAbsolutePath()));
    }

    public torrent_info getSwig() {
        return this.ti;
    }

    public String getName() {
        return this.name;
    }

    public long getTotalSize() {
        return this.ti.total_size();
    }

    public int getPieceLength() {
        return this.ti.piece_length();
    }

    public int getNumPieces() {
        return this.ti.num_pieces();
    }

    public String getInfoHash() {
        return infoHash;
    }

    public String mkString() {
        StringBuilder sb = new StringBuilder();

        sb.append("total_size = " + getTotalSize() + System.lineSeparator());
        sb.append("piece_length = " + getPieceLength() + System.lineSeparator());
        sb.append("num_pieces = " + getNumPieces() + System.lineSeparator());
        sb.append("info_hash = " + getInfoHash() + System.lineSeparator());

        return sb.toString();
    }
}
