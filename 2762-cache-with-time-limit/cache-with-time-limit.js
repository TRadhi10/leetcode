var TimeLimitedCache = function () {
  this.cache = new Map();
};

TimeLimitedCache.prototype.set = function (key, value, duration) {
  const found = this.cache.has(key);
  if (found) {
    clearTimeout(this.cache.get(key).timerId);
  }
  this.cache.set(key, {
    value,
    timerId: setTimeout(() => this.cache.delete(key), duration),
  });
  return found;
};

TimeLimitedCache.prototype.get = function (key) {
  if (this.cache.has(key)) {
    return this.cache.get(key).value;
  } else {
    return -1;
  }
};

TimeLimitedCache.prototype.count = function () {
  return this.cache.size;
};